package com.tutorsdude.EnumExample;

public class EnumRunner {
    public static void main(String[] args) {

        PaymentMethod paymentMethod = PaymentMethod.upi;
        System.out.println(paymentMethod);

        BankType bankType  = BankType.centralBank;
        System.out.println(bankType);

        CastType castType = CastType.hindu;
        System.out.println(castType);

        SeasonType seasonType = SeasonType.summer;
        System.out.println(seasonType);

        HinduEpics hinduEpics = HinduEpics.mahabharat;
        System.out.println(hinduEpics);

        Level level = Level.high;
        System.out.println(level);

        ProgrammingLanguage programmingLanguage = ProgrammingLanguage.java;
        System.out.println(programmingLanguage);

        days Days =  days.thursday;
        System.out.println(Days);

        CollegeType collegeType = CollegeType.privateCollege;
        System.out.println(collegeType);

        ExamType examType = ExamType.cbt;
        System.out.println(examType);

    }
}
