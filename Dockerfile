FROM maven:3.6-openjdk-11

WORKDIR /working_dir

COPY pom.xml /working_dir/pom.xml
COPY my-app/pom.xml /working_dir/my-app/pom.xml
COPY ch7-lambdas-and-streams/pom.xml /working_dir/ch7-lambdas-and-streams/pom.xml

RUN mvn -T1C dependency:go-offline clean install

COPY . /working_dir

RUN mvn -T1C clean install

ENTRYPOINT ["echo", "not for run"]

