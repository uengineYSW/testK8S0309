
#### Object: testsa
#### Type: ServiceAccount

### Cluster에 testsa ServiceAccount를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/ServiceAccount/testsa.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T020940Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=81c2c14c5a75a2aef35343c675fac90a005676fab950d0fbd893e01a39f021d4
```
- Yaml 파일에 명시된 스펙으로 testsa ServiceAccount를 생성합니다.

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/ServiceAccount/testsa.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T020940Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=81c2c14c5a75a2aef35343c675fac90a005676fab950d0fbd893e01a39f021d4
```
- Create가 된 상태라면 testsa ServiceAccount의 수정이 이루어지고, Create가 된 상태가 아니라면 testsa ServiceAccount를 Create 해주는 명령어입니다.  
#

### testsa ServiceAccount가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get ServiceAccount

NAME            READY   UP-TO-DATE   AVAILABLE   AGE
testsa           3/3     3            3           5m43s

```
- testsa ServiceAccount와 Pod, Replicaset이 모두 확인이 된다면 정상적으로 생성된 것입니다.
#

```
$ kubectl delete ServiceAccount testsa
```
#
