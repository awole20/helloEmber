# Ember Testing

This project is for testing out [EmberJS](http://emberjs.com/).

Already, the project doesn't seem to be handling JSON via ajax very well. The json payload from the servlet only updates the view once-in-a-while, every few refreshes. Why is this. It looks like emberjs plays well with jquery, but not vanilla JS. This is fixed using $(data).each in the callback

The origin of this tutorial is from [this example](https://www.adobe.com/devnet/html5/articles/flame-on-a-beginners-guide-to-emberjs.html).
