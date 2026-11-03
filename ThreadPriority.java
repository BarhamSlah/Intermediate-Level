1. Thread Priority (getPriority() and setPriority())

Priority Range: Thread priorities in Java range from 1 (least priority) to 10 (maximum priority), with 5 being the default normal priority.

Constants: The Thread class provides built-in constants such as Thread.MIN_PRIORITY, Thread.NORM_PRIORITY, and Thread.MAX_PRIORITY.

Important Note: Setting priority is only a suggestion to the operating system's thread scheduler. It does not strictly guarantee exact execution order, as different schedulers use different algorithms but it
has more chance to execute.

************************************************************************************************************************************************************************************************************

The sleep() method throws a checked InterruptedException, which must be handled using a try-catch block. 

************************************************************************************************************************************************************************************************************
  
 
