<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
    <class name="com.eolinc.dto.Profile" table="profile">
        <id name="profileId" type="long" column="PROFILE_ID" >
            <generator class="assigned" />
        </id>
        <property name="accountId" type="long" column="ACCOUNT_ID" not-null="true" />
        <property name="profileType" type="char" column="PROFILE_TYPE" length="2" not-null="true" />
        <property name="profileFname" column="PROFILE_FNAME" length="45" not-null="true" />
        <property name="profileMname" column="PROFILE_MNAME" length="45" />
        <property name="profileLname" column="PROFILE_LNAME" length="45" not-null="true" />
        <property name="profileSuffx" column="PROFILE_SUFFX" length="4" />
        <property name="profileAddr1" column="PROFILE_ADDR1" length="80" />
        <property name="profileAddr2" column="PROFILE_ADDR2" length="80" />
        <property name="profileAddr3" column="PROFILE_ADDR3" length="80" />
        <property name="profileCity" column="PROFILE_CITY" length="25" />
        <property name="profileState" column="PROFILE_STATE" length="25" />
        <property name="profileZip" column="PROFILE_ZIP" length="10" />
        <property name="profileCntry" column="PROFILE_CNTRY" length="25" />
        <property name="profileAttn" column="PROFILE_ATTN" length="80" />
        <property name="profileBdayDt" type="date" column="PROFILE_BDAY_DT" length="10" />
        <property name="profileEmail" column="PROFILE_EMAIL" length="80" />
        <property name="profileTextMsg" type="long" column="PROFILE_TEXT_MSG" />
        <property name="addedDt" type="date" column="ADDED_DT" length="10" not-null="true" />
        <property name="addedBy" column="ADDED_BY" length="20" not-null="true" />
        <property name="updtDt" type="date" column="UPDT_DT" length="10" not-null="true" />
        <property name="updtBy" column="UPDT_BY" length="20" not-null="true" />
    </class>
</hibernate-mapping>
