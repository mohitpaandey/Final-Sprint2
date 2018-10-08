package com.matchzone.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.matchzone.model.CertificationIndex;
import com.matchzone.model.LocationIndex;
import com.matchzone.model.ProjectIndex;
import com.matchzone.model.QualifiactionIndex;
import com.matchzone.model.SkillsIndex;

@EnableKafka
@Configuration
public class KafkaConfig {

	
	
	@Bean
    public ConsumerFactory<String, String> consumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        return new DefaultKafkaConsumerFactory<>(config);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
//skill
    @Bean
    public ConsumerFactory<String, SkillsIndex> skillConsumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "skill_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(SkillsIndex.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, SkillsIndex> skillKafkaListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, SkillsIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(skillConsumerFactory());
        return factory;
    }
	
//location
    @Bean
    public ConsumerFactory<String, LocationIndex> locationConsumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "loc_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(LocationIndex.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, LocationIndex> locationKafkaListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, LocationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(locationConsumerFactory());
        return factory;
    }
    
  //certification
    @Bean
    public ConsumerFactory<String, CertificationIndex> certiConsumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "certi_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(CertificationIndex.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CertificationIndex> certiKafkaListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, CertificationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(certiConsumerFactory());
        return factory;
    }
    
    
    
  //Project
    @Bean
    public ConsumerFactory<String, ProjectIndex> projectConsumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "project_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(ProjectIndex.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, ProjectIndex> projKafkaListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ProjectIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(projectConsumerFactory());
        return factory;
    }
    
    
    //Qualification
    @Bean
    public ConsumerFactory<String, QualifiactionIndex> qualConsumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "qual_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>( QualifiactionIndex.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,QualifiactionIndex> qualKafkaListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, QualifiactionIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(qualConsumerFactory());
        return factory;
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
///**Skills config**/
//	@Bean
//	public ConsumerFactory<String, SkillsIndex> consumerFactory() {
//		Map<String, Object> config = new HashMap<>();
//
//		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//		config.put(ConsumerConfig.GROUP_ID_CONFIG, "skill_json");
//		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//		return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new JsonDeserializer<>(SkillsIndex.class));
//	}
//
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<String, SkillsIndex> kafkaListenerContainerFactory() {
//		ConcurrentKafkaListenerContainerFactory<String, SkillsIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//		return factory;
//	}
}
/**qualification config**/
//
//		@Bean
//		public ConsumerFactory<String, QualifiactionIndex> qualiConsumerFactory() {
//			Map<String, Object> config = new HashMap<>();
//
//			config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//			config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
//			config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//			config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//			return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
//					new JsonDeserializer<>(QualifiactionIndex.class));
//		}
//
//		@Bean
//		public ConcurrentKafkaListenerContainerFactory<String, QualifiactionIndex> qualiKafkaListenerFactory() {
//			ConcurrentKafkaListenerContainerFactory<String, QualifiactionIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
//			factory.setConsumerFactory(qualiConsumerFactory());
//			return factory;
//		}
//
///** Location config**/
//		@Bean
//		public ConsumerFactory<String, LocationIndex> locConsumerFactory() {
//			Map<String, Object> config = new HashMap<>();
//
//			config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//			config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
//			config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//			config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//			return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
//					new JsonDeserializer<>(LocationIndex.class));
//		}
//
//		@Bean
//		public ConcurrentKafkaListenerContainerFactory<String, LocationIndex> locKafkaListenerFactory() {
//			ConcurrentKafkaListenerContainerFactory<String, LocationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
//			factory.setConsumerFactory(locConsumerFactory());
//			return factory;
//		}
//
///**Certification  config **/
//		@Bean
//		public ConsumerFactory<String, CertificationIndex> cerConsumerFactory() {
//			Map<String, Object> config = new HashMap<>();
//
//			config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//			config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
//			config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//			config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//			return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
//					new JsonDeserializer<>(CertificationIndex.class));
//		}
//
//		@Bean
//		public ConcurrentKafkaListenerContainerFactory<String, CertificationIndex> cerKafkaListenerFactory() {
//			ConcurrentKafkaListenerContainerFactory<String, CertificationIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
//			factory.setConsumerFactory(cerConsumerFactory());
//			return factory;
//		}
//
///**Project config **/
//		@Bean
//		public ConsumerFactory<String, ProjectIndex> proConsumerFactory() {
//			Map<String, Object> config = new HashMap<>();
//
//			config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//			config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
//			config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//			config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//			return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
//					new JsonDeserializer<>(ProjectIndex.class));
//		}
//
//		@Bean
//		public ConcurrentKafkaListenerContainerFactory<String, ProjectIndex> proKafkaListenerFactory() {
//			ConcurrentKafkaListenerContainerFactory<String, ProjectIndex> factory = new ConcurrentKafkaListenerContainerFactory<>();
//			factory.setConsumerFactory(proConsumerFactory());
//			return factory;
//		}
//
//	}
