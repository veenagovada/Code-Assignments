Middleware is the programming pattern of providing hooks with a resume callback. Your tasks is to implement Middleware functionality. Here is the basic usage of the file we will be testing against

```js
var Middleware = require('./');  // <- this is the file you make;

var middleware = new Middleware();

middleware.use(function(next) {
  var self = this;
  setTimeout(function() {
    self.hook1 = true;
    next();
  }, 10);
});

middleware.use(function(next) {
  var self = this;
  setTimeout(function() {
    self.hook2 = true;
    next();
  }, 10);
});

var start = new Date();
middleware.go(function() {
  console.log(this.hook1); // true
  console.log(this.hook2); // true
  console.log(new Date() - start); // around 20
});
```
