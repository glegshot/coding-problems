package org.challenges.reflection;

public class DummyDriver {

    private String driverName;
    private Long driverVersion;

    public DummyDriver() {
    }

    public DummyDriver(String name, Long age){
        this.driverName = name;
        this.driverVersion = age;
    }

    public DummyDriver(String name){
        this.driverName = name;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Long getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(Long driverVersion) {
        this.driverVersion = driverVersion;
    }

    public void printDetails(){
        System.out.println(this.driverName+":"+this.driverVersion);
    }

}
