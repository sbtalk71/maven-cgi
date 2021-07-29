 
##Enable Tomcat deployer user  in $CATALINA_HOME\conf\tomcat-users:

<role rolename="manager-gui"/>
<role rolename="manager-script"/>
<user username="admin" password="password" roles="manager-gui, manager-script"/>
 
## settings.xml
 <server>
    <id>TomcatServer</id>
    <username>admin</username>
    <password>password</password>
</server>
 
 ##Plugin config
 
 <plugin>
    <groupId>org.apache.tomcat.maven</groupId>
    <artifactId>tomcat7-maven-plugin</artifactId>
    <version>2.2</version>
    <configuration>
        <url>http://localhost:8080/manager/text</url>
        <server>TomcatServer</server>
        <path>/myapp</path>
    </configuration>
</plugin>

mvn tomcat7:deploy
To undeploy it:

mvn tomcat7:undeploy
To redeploy after making changes:

mvn tomcat7:redeploy