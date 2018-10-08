import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewExperienceComponent } from './view-experience.component';

describe('ViewExperienceComponent', () => {
  let component: ViewExperienceComponent;
  let fixture: ComponentFixture<ViewExperienceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewExperienceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewExperienceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
