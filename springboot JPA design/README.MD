## Spring boot jpa with lombok,jpa,h2
## used tools :man:
* Spring boot 
* MySQL 5.1.45
* Java 1.8
* JPA
* Hibernate
* Maven
* lombok
* IntelliJ IDEA
``` 
/* model class */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class User {
    @Id
    private int id;
    private String name;
    private String job;
    private int age;
    private int career;
}

```

### controller 
```
@Autowired
    private UserService service;

    @GetMapping("/getUsers")
    public List<User> getAllUser(){
        return service.getUser();
    }


    @GetMapping("/getUserByJob/{job}")
    public List<User> getUserByJob(@PathVariable String job){
        return service.getUserByJob(job);
    }

    @GetMapping("/getUserCount/{age}")
    public String getCountByAge(@PathVariable int age){
        long count=service.getCounts(age);
        return "total count"+count;
    }

    @DeleteMapping("/delete/{name}")
    public List<User> deleteUser(@PathVariable String name){
        return service.deleteUser(name);
    }

    @GetMapping("/getUserWithCareer/{career}")
    public List<User> getUserByCareer(@PathVariable int career){
        return service.getCareerUser(career);
    }

    @GetMapping("/findmulti/{job}/{age}")
    public List<User> getUserByJobAndAge(@PathVariable String job,@PathVariable int age){
        return service.findByMultiCondition(job,age);
    }

    @GetMapping("/getuserwithignore")
    public List<User> getUserByIgnore(@RequestParam("job") String job){
        return service.findByIgnoreCondition(job);
    }

    @GetMapping("/getSort/{field}")
    public List<User> getSortedUser(@PathVariable String field){
        return service.getUserSort(field);
    }

    @GetMapping("/getquery")
    public List<User> getUserByQuery(){
        return service.getUsersCustomQuery();
    }
```


### Request Test :woman:
<details>
<summary>getrequest for alluser🏣 </summary>
<img src=https://user-images.githubusercontent.com/40031858/88480458-e906d200-cf90-11ea-8b38-a872bd6a0e33.png width=600px>
</details>

#### `Look at the controller code and try various requests and they will all come out.`