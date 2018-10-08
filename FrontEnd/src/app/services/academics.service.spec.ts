import { TestBed, inject } from '@angular/core/testing';

import { AcademicsService } from './academics.service';

describe('AcademicsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AcademicsService]
    });
  });

  it('should be created', inject([AcademicsService], (service: AcademicsService) => {
    expect(service).toBeTruthy();
  }));
});
