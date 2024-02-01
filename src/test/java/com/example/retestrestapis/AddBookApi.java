import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AddBookApi {
  @BeforeAll
  public static void setUrl(){
    RestAssured.baseURI = "https://simple-books-api.glitch.me";

  }
  @Test
  public void addBook_should_return_201(){
    Books body = new Books();
    body.bookId = 79;
    body.customerName = "Test";

    given().contentType(ContentType.JSON)
        .body(body)
        .header("Authorization", "273114776775f6dc2a3b434275906cb908daa98628fcc7a75757a451c819d0f5")
        .post("/orders").then().statusCode(201);

  }
  class Books{
    public Integer bookId;
      public String customerName;

    public Books(){

    }
  }


}
