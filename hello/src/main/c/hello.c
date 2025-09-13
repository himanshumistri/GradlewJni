#include <jni.h>
#include <stdio.h>
#include <string.h>

// Define the JNI function to return a string
JNIEXPORT jstring JNICALL
Java_HelloWorld_print(JNIEnv *env, jobject obj)
{
    // The string we want to return
    const char *message = "Hello from JNI!";

    // Convert the C string to a JNI string (jstring) and return it
    return (*env)->NewStringUTF(env, message);
}