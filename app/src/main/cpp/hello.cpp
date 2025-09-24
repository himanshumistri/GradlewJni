#include <jni.h>
#include <iostream>  // C++ header for I/O
#include <string>    // C++ header for string operations

// Define the JNI function to return a string
extern "C" JNIEXPORT jstring JNICALL
Java_HelloWorld_print(JNIEnv *env, jobject obj) {
    // The string we want to return as a C++ std::string
    std::string message = "Hello from JNI (with C++)! Himanshu";

    // Print the message to the console using C++ I/O
    std::cout << "Message sent to Java: " << message << std::endl;

    // Convert the C++ string to a JNI string (jstring) and return it
    return env->NewStringUTF(message.c_str());
}