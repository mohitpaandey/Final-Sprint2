import { TestBed, inject } from '@angular/core/testing';

import { CertificationService } from './certification.service';

describe('CertificationService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CertificationService]
    });
  });

  it('should be created', inject([CertificationService], (service: CertificationService) => {
    expect(service).toBeTruthy();
  }));
});
