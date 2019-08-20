package com.sda.projects.money

import spock.lang.Specification
import spock.lang.Unroll

import java.time.LocalDate

class DateCheckerTest extends Specification {
    DateChecker dateChecker=[]
    @Unroll
    def "CheckDate #date #expected"() {
        when:
        def result=dateChecker.checkDate(date)
        then:
        expected==result
        where:
        date                                             ||  expected
        "2019-08-20"                                     ||true
        "2019.08.20"                                     ||false
        ""                                               ||false
        LocalDate.now().toString()                       ||true
        LocalDate.now().plusDays(1).toString()  ||false
    }
}
