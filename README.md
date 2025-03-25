# Description of Changes

# What We Did
- Created an interface to handle the high level module which was depending on the low level module.
- We seperated these methods into three, createReaderWriter, readAndWriteToFile, and finish.
- These removed the high level abstraction relying on the low level abstraction.
- We had to comment out the other method as the URL was no longer supported.

# What They Did
- Made multiple interfaces for reader, writer, and the database.
- Created the reader and writer within the main class not in the encoding module.
- They further seperated methods and made more java classes.
