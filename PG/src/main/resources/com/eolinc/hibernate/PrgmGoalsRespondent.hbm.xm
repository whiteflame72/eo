<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
    <class name="com.eolinc.dto.PrgmGoalsRespondent" table="prgm_goals_respondent">
        <id name="prgmGoalsRespondentId" type="long" column="RESPONDENT_ID">
            <generator class="assigned" />
        </id>
        <property name="respondentDt" type="date" column="RESPONDENT_DT" length="10" not-null="true" />
        <property name="respondentType" column="RESPONDENT_TYPE" length="7" />
        <property name="studentId" type="long" column="STUDENT_ID" not-null="true" />
        <property name="teacherId" type="long" column="TEACHER_ID" not-null="true" />
        <property name="subjectId" type="long" column="SUBJECT_ID" not-null="true" />
        <property name="studentRank" type="big_decimal" column="STUDENT_RANK" precision="2" scale="0" not-null="true" />
        <property name="gradePctg" type="big_decimal" column="GRADE_PCTG" precision="4" not-null="true" />
        <property name="addedDt" type="date" column="ADDED_DT" length="10" not-null="true" />
        <property name="addedBy" column="ADDED_BY" length="20" not-null="true" />
        <property name="updtDt" type="date" column="UPDT_DT" length="10" not-null="true" />
        <property name="updtBy" column="UPDT_BY" length="20" not-null="true" />
 
    </class>
</hibernate-mapping>
