# Millimeterwave_onos_app
A millimeterwave application based on onos

<img src="https://github.com/DINGDAMU/Millimeterwave_onos_app/blob/master/architecture%20overview.png" width="50%" height="50%" />
# prerequisites
- Java 8 JDK (Oracle Java recommended; OpenJDK is not as thoroughly tested)
- Apache Maven 3.3.9
- git
- bash (for packaging & testing)
- Apache Karaf 3.0.5
- ONOS (git clone https://gerrit.onosproject.org/onos)  
----->More information you can find [here](https://wiki.onosproject.org/display/ONOS/Installing+and+Running+ONOS)


# Installation 
    git clone https://github.com/DINGDAMU/Millimeterwave_onos_app.git 
    cd millimeterwave_app
    mvn clean install 
    onos-app localhost reinstall! target/millimeterwave_app-1.0-SNAPSHOT.oar
 
#Usage 1
##ShowComponetsCommand:
###Show all components by default
    onos>showcomponets  
###Show only devices
    onos>showcomponets -d  
###Show only links
    onos>showcomponets -l  
###Show only hosts
    onos>showcomponets -h  
    
##Description:
The application can acquire the mininet's topology from different subsystems via northbound APIs, such as HostService, LinkService and DeviceService.



