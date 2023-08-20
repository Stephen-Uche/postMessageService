# postMessageService



## Iths Webservices and Integrations Lab

MongoDB.

### EndPoints: On Postman
### POST /api/post
http://hostname:8080/api/post 

Format(Body,JSON): <BR>
{<BR>
"sendersUsername": "#name",<BR>
"receiversUsername": "#name",<BR>
"message": "#messages"<BR>
}<BR>

---

### GET /api/inbox
http://hostname:8080/api/inbox?receiversUsername=nameOfreceiver&page=0&size=messagesize <BR>


