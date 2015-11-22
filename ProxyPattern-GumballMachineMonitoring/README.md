#Proxy Pattern

**Definition: The Proxy Pattern provides a surrogate or placeholder for another object to control access to it**

*Notes on RMI(Remote Method Invocation) provided in Java*

* The RMI Stub is the Client Helper
* The RMI Skeleton is the Service Helper (the one you access on a remote network)

Steps to build a RMI architecture:

1. Make a Remote Interface: calls that will be handled by the STUB and the Skeleton
2. Make a Remote Implementation
3. Generate stubs and skeletons with RMIC
4. Start the RMI registry
5. Start the remote service

*Side notes*

* Interface(s) extend(s) java.rmi.Remote
* Methods throws RemoteException
* Arguments, return values must be "primitives" or Serializable

**Don't forget**

1. Start rmiregistry
2. Serialize arguments and return values
3. Give the stub class to the client

*For more see pages 14-20 chapter 11 of Head First Design Patter* 