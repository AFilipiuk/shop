#!/bin/sh

echo "************ UNDEPLOYING *******************"
asadmin undeploy CakeShop
echo "************ BUILDING **********************"
mvn package
echo "************ DEPLOYING *********************"
asadmin deploy target/CakeShop.war