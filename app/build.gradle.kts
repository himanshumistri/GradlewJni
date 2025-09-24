import org.gradle.internal.jvm.Jvm


plugins {
    `cpp-library` // <1>
    //`cpp-unit-test` // <2>
}

library { // <3>
    linkage.set(listOf(Linkage.SHARED)) // Explicitly declare shared library

    targetMachines.add(machines.macOS)

   binaries.configureEach {
       compileTask.get().apply {
           // Include JNI headers from the JDK
           includes.from("${Jvm.current().javaHome}/include") // Base JNI include folder

           // Include platform-specific JNI headers (macOS in this case)
           includes.from("${Jvm.current().javaHome}/include/darwin") // Darwin subfolder for macOS
       }

   }

}
