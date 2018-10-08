package com.matchzone.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.matchzone.model.AcademicDetails;
import com.matchzone.model.Certification;
import com.matchzone.model.Location;
import com.matchzone.model.PersonalInfo;
import com.matchzone.model.Project;
import com.matchzone.model.Skills;
import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConfiguration {

    // AcademicDetails
    @Bean
    public ConsumerFactory<String, AcademicDetails> academicDetailsConsumerFactory() 
    {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "acad_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(AcademicDetails.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, AcademicDetails> kafkaListenerContainerFactory() 
    {
        ConcurrentKafkaListenerContainerFactory<String, AcademicDetails> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(academicDetailsConsumerFactory());
        return factory;
    }
    
    // Certification
    @Bean
    public ConsumerFactory<String, Certification> certificationConsumerFactory() 
    {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "certi_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(Certification.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Certification> certiKafkaListenerContainerFactory() 
    {
        ConcurrentKafkaListenerContainerFactory<String, Certification> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(certificationConsumerFactory());
        return factory;
    }    
    
    // Location
    @Bean
    public ConsumerFactory<String, Location> locationConsumerFactory() 
    {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "loc_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(Location.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Location> locKafkaListenerContainerFactory() 
    {
        ConcurrentKafkaListenerContainerFactory<String, Location> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(locationConsumerFactory());
        return factory;
    } 
    
    // PersonalInfo
    @Bean
    public ConsumerFactory<String, PersonalInfo> personalinfoConsumerFactory() 
    {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "person_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(PersonalInfo.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, PersonalInfo> personKafkaListenerContainerFactory() 
    {
        ConcurrentKafkaListenerContainerFactory<String, PersonalInfo> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(personalinfoConsumerFactory());
        return factory;
    }    
    
    // Project
    @Bean
    public ConsumerFactory<String, Project> projectConsumerFactory() 
    {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "proj_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(Project.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Project> projectKafkaListenerContainerFactory() 
    {
        ConcurrentKafkaListenerContainerFactory<String, Project> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(projectConsumerFactory());
        return factory;
    }   
    
    // Skills
    @Bean
    public ConsumerFactory<String, Skills> skillsConsumerFactory() 
    {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "skill_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(Skills.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Skills> skillsKafkaListenerContainerFactory() 
    {
        ConcurrentKafkaListenerContainerFactory<String, Skills> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(skillsConsumerFactory());
        return factory;
    }

}
