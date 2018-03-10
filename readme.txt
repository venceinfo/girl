1. install mysql
	1> use zip package, because it's easy to use and 100% success.
	   .exe or .msi may be install failed
	   
	2> config
		must copy my-default.ini to my.ini, then modify them or just my.ini. (because only by this way can we success to modify charset. 
		still not figure out the reason.
			G:\mysql-5.6.39-winx64\my.ini
		add msyql bin path to system path
		
	3> use administor to start cmd:
		cd mysql bin dir, execute: msyqld -install to install it as a service
	    net start mysql
		net stop  mysql
		sc delete mysql // to delete the service; learn sc command
		
	4> by default, root's passord is empty, so you can login by : mysql -uroot
	   when login, modify the passwd:
			use mysql ;
			update user set password=password("new_pass") where user="root"; 
			flush privileges; 
			exit ;
		check the charset: show variables like '%char%';
		
	5> install NvCat sql client: G:\software\navicat_1349.zip
	   it's very easy and useful
	   
		
2. maven config
	G:\maven3\conf\settings.xml
  
	1> add a mirror to speed up
		 <mirror>
		  <id>nexus-aliyun</id>
		  <mirrorOf>*</mirrorOf>
		  <name>Nexus aliyun</name>
		  <url>http://maven.aliyun.com/nexus/content/groups/public</url>
		</mirror>
	2> reset local repository
		<localRepository>G:\\maven_repository</localRepository>

3. idea config
	file\setttings
		ctrl+shit+n   --- to find a file in project
		font size
		alt+enter  ---- auto fix or import
		alt+insert ----- get/set
		ctrl+f12 ----- same as ctrl + o in eclipse
		
		File and Code templates, modify File Header(not ActionScripts File Header), check Enable Live Templates
		
4. spring jpa
	@Entity will let spring jpa to create a table when app start. (controlled by application.yml)
	@Transaction, it depends on table's engine. the enigne must be InnoDB, or trasanction will not take effect.
	
5. Controller
	@ResetController, the response content-type is application/json;charset=utf-8 automatically.
	
	
6. Service
	@Service
	
7. Component
   @Component	// means this class will be scanned for annocation, other annocation auto includes it, like @controller,@service, @Respository
   @ConfigurationProperties(prefix="girl")   use to get application.yml config to this Object
   

8. rest api
    get/post  /girls
	get/put/delete  /girls/{id}

	use postman tool:
	notice:
		post: form-data
	    put: x-www-form-data-urlencoded
	
	@GetMapging, @PostMapping , ...
	@PathVariable, @PathParam
	

9. Three ways to start a spring-boot app
    1> by idea
	2> mvn install;  mvn spring-boot:run
	3> mvn install; java -jar xxx.jar --spring.profiles.active=dev
	
10. application.yml, application-dev.yml, application-product.yml
	used for developer, product case
	
11. 	






