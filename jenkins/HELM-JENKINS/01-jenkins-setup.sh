#!/bin/sh

./../namespaces.sh

kubectl apply -f 01-jenkins-pv-pvc.yaml

helm install --name-template jenkins --set persistence.existingClaim=jenkins --set master.serviceType=NodePort --set master.nodePort=30808 --namespace devops stable/jenkins --values 01-jenkins-values.yaml

kubectl create rolebinding sa-devops-role-clusteradmin --clusterrole=cluster-admin --serviceaccount=devops:default --namespace=devops
kubectl create rolebinding sa-devops-role-clusteradmin-kubesystem --clusterrole=cluster-admin --serviceaccount=devops:default --namespace=kube-system
