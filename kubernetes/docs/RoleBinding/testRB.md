
#### Object: testRB
#### Type: RoleBinding

### Cluster에 testRB RoleBinding를 생성하려면 아래의 명령어를 실행하세요.

```
kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/RoleBinding/testRB.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T013859Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=c7c86a9046b4a629386514b7dcc9275148fbe67bb1fe503e8d28515392c29408
```
- Yaml 파일에 명시된 스펙으로 testRB RoleBinding를 생성합니다.
- StorageClass는 자동으로 볼륨을 생성 & 할당(Dynamic Provisioning)할 수 있게 합니다.

```
kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/RoleBinding/testRB.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T013859Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=c7c86a9046b4a629386514b7dcc9275148fbe67bb1fe503e8d28515392c29408
```
- Create가 된 상태라면 testRB RoleBinding의 수정이 이루어지고, Create가 된 상태가 아니라면 testRB RoleBinding를 Create 해주는 명령어입니다.  
#

### 생성된 testRB RoleBinding의 상세 실행 정보를 확인하시려면 아래의 명령어를 입력하세요.

```
Kubectl describe RoleBinding testRB
```
- testRB RoleBinding의 실행 정보 상태를 확인하여 문제가 있는지 확인합니다.  
#

### testRB RoleBinding를 삭제하려면 아래의 명령어를 실행하세요.

```
kubectl delete RoleBinding testRB
```
#
