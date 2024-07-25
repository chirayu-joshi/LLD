In Proxy Design Pattern, when a client requests for a real object, a proxy object is introduced between them. So the
request going to the real object passes through the proxy object.

The implementation of this pattern is called proxy design pattern.

Uses:
1. If you are a student and using internet from your campus internet, then whenever you make any request, it will go
through a proxy of your campus server. The campus server verifies your request, and it blocks it if the website is
present in the blocking list.
2. Caching. When a client makes a request to server, a proxy server of cache is present between them. The cache proxy
server checks if the data can be sent directly via cache server instead of actual server.
3. Pre-Processing and Post-Processing of any client request. For example, if a request is made by the client, the proxy
layer can add logs for that request, or publish any event if a certain API is being called. 
