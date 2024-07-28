# Cookies Implementation in Servlets

This repository contains a Java web application demonstrating the use and implementation of cookies in servlets using the `Cookie` class in Java. The example showcases how to create, read, and delete cookies, providing a comprehensive understanding of cookie management in a web application.

## Key Concepts Covered

### What are Cookies?

Cookies are small pieces of data that a server sends to a client's web browser. The browser may store these cookies and send them back to the server with subsequent requests. Cookies are commonly used to manage user sessions, track user activities, and store user preferences.

### How Cookies Work

1. **Creating Cookies**:
   - A server can create a cookie by including a `Set-Cookie` header in the HTTP response.
   - The browser stores the cookie and sends it back to the server with subsequent requests to the same domain.

2. **Reading Cookies**:
   - The server can read cookies sent by the browser using the `Cookie` header in the HTTP request.
   - Cookies are parsed and made available to servlets through the `HttpServletRequest` object.

3. **Deleting Cookies**:
   - A server can delete a cookie by setting its maximum age to zero.
   - The browser will remove the cookie once it receives the `Set-Cookie` header with a zero max age.

### Cookie Attributes

- **Name**: The name of the cookie. This is a required attribute.
- **Value**: The value of the cookie. This is a required attribute.
- **Max-Age**: Specifies the maximum age of the cookie in seconds. A value of zero deletes the cookie.
- **Domain**: Specifies the domain for which the cookie is valid.
- **Path**: Specifies the URL path for which the cookie is valid.
- **Secure**: Indicates that the cookie should only be sent over secure protocols such as HTTPS.
- **HttpOnly**: Indicates that the cookie is accessible only through HTTP and not via client-side scripts.

## Implementation Details

### Creating Cookies in Servlets

To create a cookie in a servlet, you instantiate a `Cookie` object, set its attributes, and add it to the response.

**Steps to Create a Cookie**:
1. Create an instance of the `Cookie` class with a name and value.
2. Set optional attributes like `maxAge`, `path`, `domain`, `secure`, and `httpOnly`.
3. Add the cookie to the response using `HttpServletResponse.addCookie()` method.

### Reading Cookies in Servlets

To read cookies in a servlet, you retrieve them from the `HttpServletRequest` object and loop through them to find the desired cookie.

**Steps to Read a Cookie**:
1. Retrieve an array of `Cookie` objects from the request using `HttpServletRequest.getCookies()`.
2. Loop through the array to find the cookie by its name.
3. Retrieve the value of the cookie.

### Deleting Cookies in Servlets

To delete a cookie in a servlet, you set its maximum age to zero and add it to the response.

**Steps to Delete a Cookie**:
1. Retrieve the cookie from the request.
2. Set its `maxAge` to zero.
3. Add the cookie to the response to remove it from the browser.

## Project Structure

The project structure includes the following key components:

- **Web Content**:
  - `index.html`: A welcome page with links to set, read, and delete cookies.
  
- **Servlets**:
  - `Servlet1.java`: Creates a cookie and sends it to the client.
  - `Servlet2.java`: Reads and displays cookies sent by the client.

- **Configuration**:
  - `web.xml`: Configures the servlet mappings.

## How to Run

1. **Deploying the Application**:
   - Package the application as a WAR file or deploy the project directly on a servlet container like Apache Tomcat.

2. **Accessing the Application**:
   - Navigate to the web application URL. The `index.html` file will be loaded by default.
   - Use the provided links to set, read, and delete cookies.

## Conclusion

This repository provides a practical example of how to manage cookies in a Java web application using servlets. By exploring this repository, you will gain insights into creating, reading, and deleting cookies, enabling you to effectively manage user sessions and preferences in your own web applications.
