# Gson-Polymorphism-Example
[![Java8](https://img.shields.io/badge/Java-8.0-orange.svg?style=popout)](https://www.java.com)
[![build](https://travis-ci.org/dyhe83/Gson-Polymorphism-Example.svg?branch=master)](https://travis-ci.org/dyhe83/Gson-Polymorphism-Example)

* A simple Gson polymorphism serialization and deserialization example by using TypeAdapterFactory.
* Modified from [stack overflow](https://stackoverflow.com/questions/36780871/gson-deserialize-json-array-with-multiple-object-types/36784255#36784255) 

## How to use
```sh
$ git clone https://github.com/dyhe83/Gson-Polymorphism-Example.git --depth=1
$ cd Gson-Polymorphism-Example
$ gradle run

[Animal]
Numbers of foot = 0

[Bird]
Numbers of foot = 2
Numbers of eye  = 2

[Cat]
Numbers of foot = 4
Numbers of tail = 1
```
