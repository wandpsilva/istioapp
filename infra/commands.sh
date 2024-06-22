# COMANDOS PARA CHAMAR O ENDPOINT DA APLICACAO E VERIFICAR SEUS LOGS

export SLEEP_POD=$(kubectl get pod -l app=sleep -o jsonpath={.items..metadata.name})
kubectl exec "${SLEEP_POD}" -c sleep -- curl -sS http://istioapp-service:8080/v1/istioapp/hello-word/ping

export V1_POD=$(kubectl get pod -l app=httpbin,version=v1 -o jsonpath={.items..metadata.name})
kubectl logs "$V1_POD" -c httpbin

export V2_POD=$(kubectl get pod -l app=httpbin,version=v2 -o jsonpath={.items..metadata.name})
kubectl logs "$V2_POD" -c httpbin

# kubectl exec "${SLEEP_POD}" -c sleep -- curl -sS http://istioapp-service:8080/v1/istioapp/hello-word/ping

# kubectl logs "$V1_POD" -c httpbin
# kubectl logs "$V2_POD" -c httpbin