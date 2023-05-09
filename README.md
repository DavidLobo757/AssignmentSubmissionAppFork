# Front end
1. Import the assignment submission app front end to vscode or ide of your choosing
2. open up the terminal in your ide and run ``` npm install ``` 
 
(if npm install gives you an error and you're most likely missing the node_module folder, create a folder named node_modules and then run ```npm install``` on the terminal)

# Back end
1. Import the project as a maven project
2. Open up your Run Configuration settings and go to the Arguments tab then paste in the       following into your VM arguments and don't forget to change the settings to fit your settings. (Make sure to have 2 seperate databases created for this project such as "assignment_submission_db, proffesso_db")

   ```
    -DDB_USERNAME=root -DDB_PASSWORD=password
    -DPROFFESSO_DB_USERNAME=root -DPROFFESSO_DB_PASSWORD=password
    -DDB_URL=jdbc:mysql://localhost:3306/example_db 
    -Djwt.secret=eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY4MzIyMTAxNywiaWF0IjoxNjgzMjIxMDE3fQ.7FhvWzgmK0FrrWf1ZwfeZYKaUXo9HzT7Q5IBAJCkMuQ
    -Dspring.profiles.active=local
   ```
    The following should look like this
[![RunConfigurationsImage](https://i.postimg.cc/P5SnFmp1/sdtyyherthe.png)](https://postimg.cc/QFKzFKqM)

3. Go into com.coderscampus package and open the class file ProffessoDbConfig, on line 42  .url("jdbc:mysql://localhost:3306/example_db") change it to the database of your choosing. (Make sure to have 2 seperate databases created for this project such as "assignment_submission_db, proffesso_db").

4. Go into com.coderscampus.AssignmentSubmissionApp.service and open the class file NotificationService and change the @Value String values to your choosing. 

    [![asdfhwertyefg.png](https://i.postimg.cc/xdhmMpQC/asdfhwertyefg.png)](https://postimg.cc/d7RDKBLP)

 
## Optional
If you want to have some pre-populated data in your SQL to log in, you can look in the sql folder.
