
#### Object: testConfigMap
#### Type: ConfigMap

### Cluster에 testConfigMap ConfigMap를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/ConfigMap/testConfigMap.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T020940Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=13e1b64fbf3650854e23b884dd8a4519bb2e25094674943f67e4ab0427cd53a3
```
- Yaml 파일에 명시된 스펙으로 testConfigMap ConfigMap를 생성합니다.

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/ConfigMap/testConfigMap.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T020940Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=13e1b64fbf3650854e23b884dd8a4519bb2e25094674943f67e4ab0427cd53a3
```
- Create가 된 상태라면 testConfigMap ConfigMap의 수정이 이루어지고, Create가 된 상태가 아니라면 testConfigMap ConfigMap를 Create 해주는 명령어입니다.  
#

### testConfigMap ConfigMap가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get ConfigMap

NAME            READY   UP-TO-DATE   AVAILABLE   AGE
testConfigMap           3/3     3            3           5m43s

```
- testConfigMap ConfigMap와 Pod, Replicaset이 모두 확인이 된다면 정상적으로 생성된 것입니다.
#

```
$ kubectl delete ConfigMap testConfigMap
```
#
