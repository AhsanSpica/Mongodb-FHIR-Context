package com.example.mdbspringboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document("encounter")

public class Encounter {
    @Id
    @JsonProperty("eid")
    private String eid;
    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("participant")
    private List<Participant> participant;//practitioner
    @JsonProperty("subject")
    private Subject subject ;  //public String reference public String display;// where reference is name



    //{
    //  "id": "c256",
    //  "subject": {
    //    "reference": "Patient",
    //    "patientid": "pt678",
    //    "display": "Roel"
    //  },
    //  "participant": [
    //    {
    //      "individual": {
    //        "reference": "Practitioner",
    //        "PractitionerId": "f201"
    //      }
    //    }
    //  ]
    //}
    //as per hapi fhir specs
    //of patient
    /*
    "resourceType": "Encounter",

  "identifier": [
    {
      "use": "temp",
      "value": "Encounter_Roel_20130128"
    }
  ],
  "status": "finished",
  "class": {
    "system": "http://terminology.hl7.org/CodeSystem/v3-ActCode",
    "code": "AMB",
    "display": "ambulatory"
  },
  "type": [
    {
      "coding": [
        {
          "system": "http://snomed.info/sct",
          "code": "367336001",
          "display": "Chemotherapy"
        }
      ]
    }
  ],
  "priority": {
    "coding": [
      {
        "system": "http://snomed.info/sct",
        "code": "103391001",
        "display": "Urgent"
      }
    ]
  },
  "subject": {
    "reference": "Patient/f201",
    "display": "Roel"
  },
  "participant": [
    {
      "individual": {
        "reference": "Practitioner/f201"
      }
    }
  ],
  "length": {
    "value": 56,
    "unit": "minutes",
    "system": "http://unitsofmeasure.org",
    "code": "min"
  },
  "reasonCode": [
    {
      "text": "The patient is treated for a tumor."
    }
  ],
  "diagnosis": [
    {
      "condition": {
        "display": "Complications from Roel's TPF chemotherapy on January 28th, 2013"
      },
      "use": {
        "coding": [
          {
            "system": "http://terminology.hl7.org/CodeSystem/diagnosis-role",
            "code": "AD",
            "display": "Admission diagnosis"
          }
        ]
      },
      "rank": 2
    },
    {
      "condition": {
        "display": "The patient is treated for a tumor"
      },
      "use": {
        "coding": [
          {
            "system": "http://terminology.hl7.org/CodeSystem/diagnosis-role",
            "code": "CC",
            "display": "Chief complaint"
          }
        ]
      },
      "rank": 1
    }
  ],
  "serviceProvider": {
    "reference": "Organization/f201"
  }
}
    * */

}
