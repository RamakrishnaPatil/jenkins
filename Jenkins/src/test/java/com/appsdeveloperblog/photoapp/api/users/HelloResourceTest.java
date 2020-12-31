package com.appsdeveloperblog.photoapp.api.users;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloResourceTest {

	private MockMvc mockMvc;

	@Mock
	private HelloService helloService;

	@InjectMocks
	private HelloResource helloResource;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(helloResource).build();
	}

	/*
	 * @Test public void testHelloWorld() throws Exception {
	 * 
	 * when(helloService.hello()).thenReturn("hello");
	 * 
	 * mockMvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content()
	 * .string("hello"));
	 * 
	 * verify(helloService).hello(); }
	 * 
	 * @Test public void testHelloWorldJson() throws Exception {
	 * mockMvc.perform(get("/hello/json").accept(MediaType.APPLICATION_JSON)).
	 * andExpect(status().isOk()) .andExpect(jsonPath("$.title",
	 * Matchers.is("Greetings"))) .andExpect(jsonPath("$.value",
	 * Matchers.is("Hello World"))) .andExpect(jsonPath("$.*",
	 * Matchers.hasSize(2))); }
	 * 
	 * @Test public void testPost() throws Exception { String json = "{\n" +
	 * "  \"title\": \"Greetings\",\n" + "  \"value\": \"Hello World\"\n" + "}";
	 * mockMvc.perform(post("/hello/post").contentType(MediaType.APPLICATION_JSON).
	 * content(json)) .andExpect(status().isOk()).andExpect(jsonPath("$.title",
	 * Matchers.is("Greetings"))) .andExpect(jsonPath("$.value",
	 * Matchers.is("Hello World"))) .andExpect(jsonPath("$.*",
	 * Matchers.hasSize(2))); }
	 */
}