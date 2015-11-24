#MVC Model

A simple implementation of the MVC model.

Here we have a compound pattern:
* View: A composite pattern (i.e. the window is a composite, a button is a leaf...etc)
* Controller: A strategy pattern (the view use the Controller, without knowing what it does)
* Model: An observer pattern (both the view and the controller are observers of the model and get notified when a Model state changes)
