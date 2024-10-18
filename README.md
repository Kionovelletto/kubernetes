# kubernetes

Commands:

# Delete pods
kubectl delete pod service/spe-haproxy-backend
kubectl delete replicaset.apps/spe-haproxy-backend-9b4696b5b
kubectl delete deployment spe-haproxy-backend

# Listar services no cluster
kubectl get svc

# Exibir nodes
kubectl get nodes -o wide