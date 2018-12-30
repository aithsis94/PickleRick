# PickleRick
Dependency Injection Library, Developed for Java Gradle Projects.


Simple and Fast.

# @Component

 classes can be marked as components by declaring them final and annotating with @Component annotation.
 Singleton by default, can be prototyped.
 
                                         ----------------
                                         
# @NamedComponent

same as component, but can be named. Always Singleton.

                                         ----------------
                                         
                                         

# @Setup

Only interfaces can be annotated with this. Groups @Component(s), @NamedComponent(s) and @Setup(s).

                                         ----------------                                                                                

# @Inject

Used to mark a field/component constructor as injectable.

                                         ----------------                                                                                
                                         

# @NamedInject

used to mark a field as injectable, but injects only @NamedComponent(s).

                                         ----------------                                                                                
                                                                                  
# @NamedValue

used to mark component constructor's params injectable, but injects only @NamedComponent(s).

                                         ----------------                                                                                
                                         
Refer sample app code for examples.
