### Why do we need Mockito?
#### Background
# 用黎試每個有關連既method
- Method A -> Method B (You should have 2 unit tests)
 - Unit Test on Method A (mock Method B result)
 - Unit Test on Method B
- Advantages & Summary
 - Reduces the number of test case in Unit Test (Method A)
 - If there is a code Change on Method B (main code), you should only revise the test case in Unit Test (Method B) ONLY.