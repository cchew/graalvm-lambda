# Java for GraalVM and AWS Lambda
This code is part of the 'Java for GraalVM and AWS Lambda' introductory presentation.

1. `csv-parser-java` - for building and running vanilla Java and GraalVM CSV parser.
1. `sam-java21` - for building and deploying Java 21 AWS Lambda
1. `sam-graalvm17` - for building and deploying GraalVM 17 AWS Lambda

See `README.md` files in each project for details of how to build, run and/or deploy.

## Pre-requisites
The following will be required:

1. Oracle GraalVM (with platform specific native image tool) - https://www.graalvm.org/latest/getting-started/
1. Python (to generate the 1 million row CSV file) - https://www.python.org/downloads/
1. AWS Serverless Application Model (SAM) - https://aws.amazon.com/serverless/sam/
1. AWS account (Free Tier is fine) - https://aws.amazon.com/free
1. Docker (to build Amazon Linux native image for AWS Lambda) - https://www.docker.com/get-started/

## Disclaimer
This has only been tested on MacOS so might not work on all platforms without changes.

The code in this repository was generated using ChatGPT, GitHub Copilot and AWS SAM.