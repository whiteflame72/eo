<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
    <class name="com.eolinc.dto.Student" table="student">
        <id name="studentId" type="long" column="STUDENT_ID">
            <generator class="native" />
        </id>
        <property name="profileId" type="long" column="PROFILE_ID"/>
        <property name="grade" type="int" column="GRADE" />
    </class>
</hibernate-mapping>
