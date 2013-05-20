package com.jobmanager

import java.sql.Time

class Job {
    int number
    String customerName
    String address
    String contactNo
    Date complaintDate
    String natureOfComplaint
    String remarks
    String product
    String model
    String serialNo
    Date purchasedOn

    static constraints = {
        number blank:false
        customerName blank: false
        address blank:  false
        contactNo blank: false
        complaintDate blank:false
        natureOfComplaint blank: false
        product blank: false
        model blank: false
    }
}
