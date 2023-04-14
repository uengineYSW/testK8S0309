
#### Object: testSA
#### Type: ServiceAccount

### Cluster에 testSA ServiceAccount를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/ServiceAccount/testSA.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T013859Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=7a8f427330ac1bddd8939d80ec37f77dac8f3d939040d8cab394eba066c5216d
```
- Yaml 파일에 명시된 스펙으로 testSA ServiceAccount를 생성합니다.

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/ServiceAccount/testSA.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T013859Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=7a8f427330ac1bddd8939d80ec37f77dac8f3d939040d8cab394eba066c5216d
```
- Create가 된 상태라면 testSA ServiceAccount의 수정이 이루어지고, Create가 된 상태가 아니라면 testSA ServiceAccount를 Create 해주는 명령어입니다.  
#

### testSA ServiceAccount가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get ServiceAccount

NAME            READY   UP-TO-DATE   AVAILABLE   AGE
testSA           3/3     3            3           5m43s

```
- testSA ServiceAccount와 Pod, Replicaset이 모두 확인이 된다면 정상적으로 생성된 것입니다.
#

```
$ kubectl delete ServiceAccount testSA
```
#
