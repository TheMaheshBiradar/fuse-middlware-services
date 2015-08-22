# fuse-middlware-services
Jboss Fuse End to End service withh SOA , OSGI ,Apache Camelfor and enterprise application


1. cxf-startup is the camel & osgi based REST webservice . 

2. Build the cxf-startup project and start the jboss fuse console.
 
3. build the feature project.

4.  execute this command on jboss fuse console 
      
      features:addurl mvn:com.taggy.services/fuse-features/1.0.0-SNAPSHOT/xml/features
      features:install cxf-services



5. you can deploy this osgi based service to Jboss fuse container and check from browser or soap ui as this a GET request.

6. Hit the URL https://localhost:8443/cxf/cardService/status/1234 for SSL based service or http://localhost:8181/cxf/cardService/status/1234

