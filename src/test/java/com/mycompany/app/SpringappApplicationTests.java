package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class SpringappApplicationTests {


    @Autowired
    private MockMvc mockMvc;

    //Add A New Book
	@Test
	public void test_case1() throws Exception {
		String dataOne = "{\"ssn\":\"011\",\"bookName\":\"Harry porter\",\"authorName\":\"J. K. Rowling\",\"genre\":\"Fantasy\",\"price\":\"4000\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/addbook")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(dataOne)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();
		 	
	}

    @Test //getallbook
    public void test_case2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/allbook")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }
    
   @Test //getbook by id
    public void test_case3() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/book/011")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    
    @Test
	public void test_case4() throws Exception {
		String dataOne = "{\"ssn\":\"012\",\"bookName\":\"A Game of Thrones\",\"authorName\":\"George R. R. Martin\",\"genre\":\"Fantasy\",\"price\":\"3000\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/addbook")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(dataOne)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
	        	.andReturn();	
	}
	
	   @Test //getbook by genere
    public void test_case5() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/genre/Fantasy")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

}





