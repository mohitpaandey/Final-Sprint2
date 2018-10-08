import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewPersonalComponent } from './view-personal.component';

describe('ViewPersonalComponent', () => {
  let component: ViewPersonalComponent;
  let fixture: ComponentFixture<ViewPersonalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewPersonalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewPersonalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
