<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
    <class name="com.eolinc.dto.Teacher" table="teacher">
        <id name="teacherId" type="long" column="TEACHER_ID">
            <generator class="native" />
        </id>
        <property name="teacherFirstname" column="TEACHER_FIRST_NAME" />
        <property name="teacherLastname" column="TEACHER_LAST_NAME" />
        <property name="teacherTitle" column="TEACHER_TITLE" />
        <property name="teacherEmail" column="TEACHER_EMAIL" />
        <property name="teacherAddr1" column="TEACHER_ADDR1" />
        <property name="teacherAddr2" column="TEACHER_ADDR2" />
        <property name="teacherAddr3" column="TEACHER_ADDR3" />
        <property name="teacherCity" column="TEACHER_CITY" />
        <property name="teacherState" column="TEACHER_STATE" />
        <property name="teacherZip" column="TEACHER_ZIP" />
        <property name="teacherCountry" column="TEACHER_COUNTRY" />
        <property name="teacherAttn" column="TEACHER_ATTN" />
    </class>
</hibernate-mapping>
