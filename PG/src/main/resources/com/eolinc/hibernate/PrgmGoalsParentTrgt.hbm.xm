<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
    <class name="com.eolinc.dto.PrgmGoalsParentTrgt" table="prgm_goals_parent_trgt">
        <id name="prgmGoalsParentTrgtId" type="long" column="PARENT_TRGT_ID" >
            <generator class="assigned" />
        </id>
        <property name="respondentId" type="long" column="RESPONDENT_ID" not-null="true" />
        <property name="gradePctgTrgt" type="big_decimal" column="GRADE_PCTG_TRGT" precision="4" not-null="true" />
        <property name="gradePctgLastYr" type="big_decimal" column="GRADE_PCTG_LAST_YR" precision="4" not-null="true" />
        <property name="gradePctgAvg" type="big_decimal" column="GRADE_PCTG_AVG" precision="4" not-null="true" />
        <property name="college" column="COLLEGE" length="9" not-null="true" />
        <property name="collegeYr" type="java.lang.Byte" column="COLLEGE_YR" />
        <property name="collegeTypeId" type="long" column="COLLEGE_TYPE_ID" />
        <property name="respondentDt" column="RESPONDENT_DT" />
     </class>
</hibernate-mapping>
