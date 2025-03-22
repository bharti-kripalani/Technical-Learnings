//Client request from java servlet can contain a lot of data and most of the data can be retrieved using different methods. 
//Here are those methods. Most methods are self explanatory so their explanation is not provided.

getLocale(): //Returns the preferred locale that the client will accept the locale in.
getAttribute(String name): // Returns the value of the attribute.
getInputStream(): // Returns body of the request in binary data.
getAuthType(): // Returns BASIC, SSL or NULL
getCharacterEncoding(): // Returns encoding type like ASCII, 8-bit, UTF-8, UTF-16
getContentType(): // Returns MIME type(Type of data like application/json/xml, etc). Specifying it will help the application to decode it.
getContextPath(): // Returns URIs portion that returns context of the request.
getHeader(String name): // Returns values of the specified header.
getMethod(): // Returns Get, post, put, delete
getRequestURI()
getRequestedSessionId()
getServletPath()
getParameterValues(String name)
isSecure()
getContentLength(): // Returns the length of the request body or -1 if the length is not know.
getIntHeader(String name): // Returns value of the header as an int.
getServerPort(): // Returns the port number on which this request was received.
getParameter(String name): // Returns the parameter value or null if the param doesn't exist.
getPathInfo(): // Returns any extra path info associated with the URL.
getProtocol(): // Returns protocol like HTTP, HTTPS, etc
getQueryString(): //
getCookies(): // Returns all the cookies from the client's request as an array.
getAttributeNames(): // Returns an enum of all the attributes from the request.
getHeaderNames(): // Returns an enum of all the headers from the request.
getParameterNames(): // Returns an enum of all the parameters from the request.
getSession(): // Returns the current session or creates a new one.
getSession(boolean create) : // Returns the current session if one exists and will create a new one only if(boolean = true).
getRemoteAddr()
getRemoteHost()
getRemoteUser()


//Example: This is how any method is needed to be applied to the request to retrieve a specific value.
request.getHeaderNames();
