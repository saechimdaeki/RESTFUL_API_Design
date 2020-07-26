## Spring boot jpa with lombok,jpa,h2

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

### Request Test :woman:
<details>
<summary>getrequest for alluser🏣 </summary>
<img src=https://user-images.githubusercontent.com/40031858/88480458-e906d200-cf90-11ea-8b38-a872bd6a0e33.png width=600px>
</details>
