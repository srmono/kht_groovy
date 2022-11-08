# Grails Tutorial For Beginner & Also for Medium.
---

**[Grails](https://www.grails.org/)**  is an open source web application **(MVC)** framework that uses the **Apache Groovy** programming language 
(which is in turn based on the Java platform). It is intended to be a high-productivity framework by following the **coding by convention** 
paradigm, providing a stand-alone development environment and hiding much of the configuration detail from the developer. 

#### Login Credential
1. **Email:** ocb@domain.com
2. **Password:** 123456

## The Project Name is Online Contacts Book

#### Features 
1. People can Register them self using Registrations From.
2. After Registration He/She can Login into System.
3. Can Add New Contact Group, Such as Family, Friend, Office Others
4. Can Add New Contact along with name, Image, Contact Group, and one or more Contact Details, Phone Number, Mobile Number, 
Email Address, Address etc. Contact Details Type such as Home, Office, Personal etc.
6. Administrator User can Login and See Other Member
5. Please See the Last Video for Exercise.


<br/><br/>

## Let's Start

<br/><br/>

### Grails Features Overview 

1. **Controller**
2. **Model (Domain)**
3. **View (GSP) Groovy Server Pages**
4. **Service**
5. **TabLib**
6. **Interceptor**
7. **URLMapping**

<br/><br/>

### How to Explorer the GitHub Project v=XkPuvtRi6ZY)




### Grails jQuery and Bootstrap Integration. 
1. Grails Asset Pipe Line,  Asset Library Plugin
2. Grails Layout and View Details
3. jQuery Integration: https://jquery.com/download/
4. Bootstrap 4 Integration: https://getbootstrap.com/
5. Create a JavaScript File & Then add Project Start Point JavaScript Object.
6. Configure Navigation and Layout With Bootstrap

<br/><br/>

### Grails CRUD Registration 
1. Basic About Grails Domain 
2. Create a Class named GlobalConfig and will store common configurations, such as itemsPerPage, uuid, Member Type etc.
3. Create a Domain Called Member. Fields will be
   * Integer id
   * String firstName
   * String lastName
   * String email
   * String password
   * String identityHash
   * Long identityHashLastUpdate
   * Boolean isActive
   * String memberType [Administrator, Regular Member]
4. Add constraints & beforeUpdate & beforeInsert Event, mapping fields.

<br/><br/>

### Grails CRUD Registration 
1. Basic About Grails Controller
2. Basic About Grails URL Mapping
3. Basic About Grails Service
4. Create a Class named AppUtil which will responsible for some utility function, such as response, pick session etc.
5. Create a service with below method and adding Logic there.
   * **save** : For save data into Database
   * **update** : For Update data into Database
   * **getById** : Retrieve or read data by id from Database
   * **list** : Retrieve or read all data from Database, using pagination and basic search sort mechanism
   * **delete** : Remove data from database.
6. Create a Controller With below methods
   * **index** : Landing Page and show a table with data
   * **details** : Show details of that Entity
   * **create**: Show the create form. 
   * **save**: Create form Submit action, it will save submitted data
   * **edit**: Enable edit row data with from
   * **update**: Edit form Submit action, it will update submitted data
   * **delete**: Responsible for delete data

<br/><br/>

### Grails CRUD Registration 
1. Basic About Grails View
   * Grails Taglib
   * Partial Template
2. Localization i18n
3. Create a HTML form with Grails tag Lib  & Bootstrap 4 design into .gsp file
4. Debug Submission & Save Data 
5. Create Table and Show data.
6. Font Awesome Integration
7. Table Action and Pagination
8. Add Search Functionality
9. Update and Delete.

<br/><br/>

### Grails Custom Tag Library 
1. Basic About Custom Tag Library
2. Create Custom Tag Library & add validation message processor
3. Debug Validation Error from Save Update
4. Show error message using TagLib


<br/><br/>

### Grails Play with jQuery & Bootstrap 4 
1. Plan for Show Flash Message / Notification 
2. Create message box jQuery JS Utility (ocb.message.box.js)
3. Add Flash Massage watcher in Layout
4. Show Notification Create, Update, and Delete Action.
5. Install jQuery Confirm jQuery Plugin into project.
6. Create an Initializer js and include into project (ocb.init.js)
7. Bind Confirmation Message action in initializer for Delete Action confirmation.


<br/><br/>

### Grails Authentication & Authorization, Login Form 
1. Create Dashboard Controller & add index action for show welcome text after login
2. Create Another Layout for public view, there will no navigation, main layout will be for private access.
3. Create Authentication Service & add Logic for Login Member.
4. Create Authentication Controller & Design Login from
5. Overview of Grails Interceptor 
6. Create and Configure Interceptor


<br/><br/>

### Grails Reorganize Registration Form 
1. Expose the Registration form for public Registration.
2. Add Logout Drop-Down after Login, With Member Name
3. Restrict Member Controller for Administrator Member.
4. Add Member nav into Navigation if Member Type Administrator.
5. Create Initialization service for Init Administrator Member, Name: System Administrator, email: ocb@domain.com, password: 123456
6. Call the Initializer from Bootstrap.



<br/><br/>

### Grails Domain one-to-one, one-to-many, many-to-one, many-to-many Entity Relationship-1 
1. Basic About Grails Entity Relationship
2. Create Domain ContactGroup. Fields will be
   * Integer id
   * String name
   * Member member  (belongsTo Member Domain)
3. Create Domain Contact. Fields will be
   * Integer id
   * String name
   * String image
   * Member member  (belongsTo Member Domain)
4. Create Domain ContactDetails. Fields will be
   * Integer id
   * String mobile
   * String phone
   * String email
   * String website
   * String address
   * String type
   * Contact contact  (belongsTo Contact Domain)
5. Adjust & Describe The Relationship
6. Describe Cascade



<br/><br/>

### Grails Domain Entity Relationship, Contact Group UI 
1. Create Service and Add Logic
2. Create Controller and Add Actions
3. Create Views
4. Add message.properties
5. Add To Navigation


<br/><br/>

### Grails Domain Entity Relationship, Contact UI 
1. Create Service and Add Logic
2. Create Tag Library for Show Contact Group
3. Create Controller and Add Actions
4. Create Views
5. Add To Navigation
6. Describe The Details view



<br/><br/>

### Grails Domain Entity Relationship, Contact Details UI (
1. Create Service and Add Logic
2. Create Controller and Add Actions
3. Add Tag Lib method for Contact Type
4. Create Views
5. Add App base URL into Layout Page
6. Add jQuery Ajax call for New and Delete Contact Details into ocb.init.js
7. Include Contact Details in Contact Service and Contact form


<br/><br/>

### Grails Image or File Upload 
1. Create File Upload Util
2. Add File Upload Functionality into Contact Service
3. Test Image Upload


<br/><br/>

### Grails Change Database Configuration To MySQL 
1. Goto maven repository https://mvnrepository.com/ and search the MySQL Driver
2. Copy the Gradle config and add to project
3. Add MySQL Configuration into application.yml
4. Create Database into MySQL
5. Verify the Data Storage.



<br/><br/>

### Grails Deployment Using Tomcat (
1. Download the Tomcat from tomcat website
2. Extract the Tomcat and Clean the ROOT Directory
3. Create a war file using grails command.
4. Deploy The application to Tomcat Container.

