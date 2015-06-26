<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
    <class name="com.eolinc.dto.StudentLearningStyle" table="student_lrng_style">
    	<!--
        <id name="studentLearningStyleId" type="long" column="STUDENT_LRNG_STYLE_ID">
            <generator class="assigned" />
        </id>
        <property name="studentId" type="long" column="STUDENT_ID" />
        <property name="learningStyleId" type="long" column="LRNG_STYLE_ID" />
        -->
<composite-id name="studentLearningStylePK" class="com.eolinc.dto.StudentLearningStylePK">
	<key-property name="studentId" type="java.lang.Long">
	    <column name="STUDENT_ID" not-null="true" />
	</key-property>
	<key-property name="learningStyleId" type="java.lang.Long">
	    <column name="LRNG_STYLE_ID" not-null="true" />
	</key-property>
</composite-id>
        <property name="studentLearningStyleId" type="long" column="STUDENT_LRNG_STYLE_ID" not-null="true" />
        <property name="weight" type="long" column="WEIGHT" not-null="true" />
        <property name="subjectId" type="long" column="SUBJECT_ID" not-null="true" />
        <property name="addedDt" type="date" column="ADDED_DT" length="10" not-null="true" />
        <property name="addedBy" column="ADDED_BY" length="20" not-null="true" />
        <property name="updtDt" type="date" column="UPDT_DT" length="10" not-null="true" />
        <property name="updtBy" column="UPDT_BY" length="20" not-null="true" />
    </class>
</hibernate-mapping>
