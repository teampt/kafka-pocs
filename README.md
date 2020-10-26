# kafka-pocs

Start Zookeeper
1. run command "zkserver"

Start Kafka servers
1. .\bin\windows\kafka-server-start.bat .\config\server.properties
2. .\bin\windows\kafka-server-start.bat .\config\server-1.properties
3. .\bin\windows\kafka-server-start.bat .\config\server-2.properties

 Creating Topics
1. Open a new command prompt in the location C:\kafka_2.11-0.9.0.0\bin\windows.
2. kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Movie
