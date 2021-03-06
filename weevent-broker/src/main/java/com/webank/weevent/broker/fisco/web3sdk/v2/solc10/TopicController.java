package com.webank.weevent.broker.fisco.web3sdk.v2.solc10;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

import org.fisco.bcos.channel.client.TransactionSucCallback;
import org.fisco.bcos.web3j.abi.FunctionEncoder;
import org.fisco.bcos.web3j.abi.FunctionReturnDecoder;
import org.fisco.bcos.web3j.abi.TypeReference;
import org.fisco.bcos.web3j.abi.datatypes.Address;
import org.fisco.bcos.web3j.abi.datatypes.Bool;
import org.fisco.bcos.web3j.abi.datatypes.DynamicArray;
import org.fisco.bcos.web3j.abi.datatypes.Function;
import org.fisco.bcos.web3j.abi.datatypes.Type;
import org.fisco.bcos.web3j.abi.datatypes.Utf8String;
import org.fisco.bcos.web3j.abi.datatypes.generated.Uint256;
import org.fisco.bcos.web3j.crypto.Credentials;
import org.fisco.bcos.web3j.protocol.Web3j;
import org.fisco.bcos.web3j.protocol.core.RemoteCall;
import org.fisco.bcos.web3j.protocol.core.methods.response.TransactionReceipt;
import org.fisco.bcos.web3j.tuples.generated.Tuple1;
import org.fisco.bcos.web3j.tuples.generated.Tuple3;
import org.fisco.bcos.web3j.tuples.generated.Tuple8;
import org.fisco.bcos.web3j.tx.Contract;
import org.fisco.bcos.web3j.tx.TransactionManager;
import org.fisco.bcos.web3j.tx.gas.ContractGasProvider;
import org.fisco.bcos.web3j.tx.txdecode.TransactionDecoder;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.fisco.bcos.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 * <p>Generated with web3j version none.
 */
@SuppressWarnings("unchecked")
public class TopicController extends Contract {
    public static String BINARY = "608060405234801561001057600080fd5b50604051602080620018d38339810180604052610030919081019061008a565b806000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550506100d3565b600061008282516100b3565b905092915050565b60006020828403121561009c57600080fd5b60006100aa84828501610076565b91505092915050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6117f080620000e36000396000f30060806040526004361061006d576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680630db5c5421461007257806325bc59511461009d5780636741129c146100dc578063912849fe14610105578063f713322214610149575b600080fd5b34801561007e57600080fd5b50610087610186565b60405161009491906113bb565b60405180910390f35b3480156100a957600080fd5b506100c460048036036100bf919081019061115f565b6101af565b6040516100d393929190611537565b60405180910390f35b3480156100e857600080fd5b5061010360048036036100fe9190810190610f83565b61035c565b005b34801561011157600080fd5b5061012c6004803603610127919081019061111e565b6106e5565b604051610140989796959493929190611467565b60405180910390f35b34801561015557600080fd5b50610170600480360361016b919081019061111e565b6108e7565b60405161017d919061144c565b60405180910390f35b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905090565b600080606060006060600080871115806101c95750606487115b156101d357600a96505b60028054905095508688029250826002805490501115156101f75760009450610352565b8683016002805490501015610213578260028054905003610215565b865b94508460405190808252806020026020018201604052801561024b57816020015b60608152602001906001900390816102365790505b509150600090505b8681101561034e576002805490508310151561026e5761034e565b60028381548110151561027d57fe5b906000526020600020018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561031b5780601f106102f05761010080835404028352916020019161031b565b820191906000526020600020905b8154815290600101906020018083116102fe57829003601f168201915b5050505050828281518110151561032e57fe5b906020019060200201819052506001830192508080600101915050610253565b8193505b5050509250925092565b60006060610368610c16565b600092505b8a51831015610628578a8381518110151561038457fe5b9060200190602002015191506001826040518082805190602001908083835b6020831015156103c857805182526020820191506020810190506020830392506103a3565b6001836020036101000a0380198251168184511680821785525050505050509050019150509081526020016040518091039020606060405190810160405290816000820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200160018201548152602001600282015481525050905080602001516000141561061b57898381518110151561048e57fe5b90602001906020020151816000019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff168152505088838151811015156104dd57fe5b9060200190602002015181602001818152505087838151811015156104fe57fe5b90602001906020020151816040018181525050806001836040518082805190602001908083835b60208310151561054a5780518252602082019150602081019050602083039250610525565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051809103902060008201518160000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060208201518160010155604082015181600201559050506002829080600181540180825580915050906001820390600052602060002001600090919290919091509080519060200190610618929190610c4e565b50505b828060010193505061036d565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16632b51c66b8c898989896040518663ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016106a69594939291906113d6565b600060405180830381600087803b1580156106c057600080fd5b505af11580156106d4573d6000803e3d6000fd5b505050505050505050505050505050565b6000806000806000806000806106f9610c16565b60018a6040518082805190602001908083835b602083101515610731578051825260208201915060208101905060208303925061070c565b6001836020036101000a0380198251168184511680821785525050505050509050019150509081526020016040518091039020606060405190810160405290816000820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001600182015481526020016002820154815250509050806020015160001415985088156108db578060000151975080602001519650806040015195506000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663c4c083608b6040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161087891906114e5565b608060405180830381600087803b15801561089257600080fd5b505af11580156108a6573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506108ca919081019061119b565b809550819650829750839850505050505b50919395975091939597565b60006108f1610c16565b6001836040518082805190602001908083835b6020831015156109295780518252602082019150602081019050602083039250610904565b6001836020036101000a0380198251168184511680821785525050505050509050019150509081526020016040518091039020606060405190810160405290816000820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001600182015481526020016002820154815250509050806020015160001415156109eb5760009150610c10565b32816000019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff16815250504281602001818152505043816040018181525050806001846040518082805190602001908083835b602083101515610a705780518252602082019150602081019050602083039250610a4b565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051809103902060008201518160000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060208201518160010155604082015181600201559050506002839080600181540180825580915050906001820390600052602060002001600090919290919091509080519060200190610b3e929190610c4e565b50506000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663fd13b77684326040518363ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401610bb8929190611507565b602060405180830381600087803b158015610bd257600080fd5b505af1158015610be6573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250610c0a91908101906110f5565b50600191505b50919050565b606060405190810160405280600073ffffffffffffffffffffffffffffffffffffffff16815260200160008152602001600081525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610c8f57805160ff1916838001178555610cbd565b82800160010185558215610cbd579182015b82811115610cbc578251825591602001919060010190610ca1565b5b509050610cca9190610cce565b5090565b610cf091905b80821115610cec576000816000905550600101610cd4565b5090565b90565b6000610cff823561172d565b905092915050565b6000610d13825161172d565b905092915050565b600082601f8301121515610d2e57600080fd5b8135610d41610d3c826115a2565b611575565b91508181835260208401935060208101905083856020840282011115610d6657600080fd5b60005b83811015610d965781610d7c8882610cf3565b845260208401935060208301925050600181019050610d69565b5050505092915050565b600082601f8301121515610db357600080fd5b8135610dc6610dc1826115ca565b611575565b9150818183526020840193506020810190508360005b83811015610e0c5781358601610df28882610eaf565b845260208401935060208301925050600181019050610ddc565b5050505092915050565b600082601f8301121515610e2957600080fd5b8135610e3c610e37826115f2565b611575565b91508181835260208401935060208101905083856020840282011115610e6157600080fd5b60005b83811015610e915781610e778882610f5b565b845260208401935060208301925050600181019050610e64565b5050505092915050565b6000610ea7825161174d565b905092915050565b600082601f8301121515610ec257600080fd5b8135610ed5610ed08261161a565b611575565b91508082526020830160208301858383011115610ef157600080fd5b610efc838284611763565b50505092915050565b600082601f8301121515610f1857600080fd5b8135610f2b610f2682611646565b611575565b91508082526020830160208301858383011115610f4757600080fd5b610f52838284611763565b50505092915050565b6000610f678235611759565b905092915050565b6000610f7b8251611759565b905092915050565b600080600080600080600080610100898b031215610fa057600080fd5b600089013567ffffffffffffffff811115610fba57600080fd5b610fc68b828c01610da0565b985050602089013567ffffffffffffffff811115610fe357600080fd5b610fef8b828c01610d1b565b975050604089013567ffffffffffffffff81111561100c57600080fd5b6110188b828c01610e16565b965050606089013567ffffffffffffffff81111561103557600080fd5b6110418b828c01610e16565b955050608089013567ffffffffffffffff81111561105e57600080fd5b61106a8b828c01610e16565b94505060a089013567ffffffffffffffff81111561108757600080fd5b6110938b828c01610e16565b93505060c089013567ffffffffffffffff8111156110b057600080fd5b6110bc8b828c01610e16565b92505060e089013567ffffffffffffffff8111156110d957600080fd5b6110e58b828c01610d1b565b9150509295985092959890939650565b60006020828403121561110757600080fd5b600061111584828501610e9b565b91505092915050565b60006020828403121561113057600080fd5b600082013567ffffffffffffffff81111561114a57600080fd5b61115684828501610f05565b91505092915050565b6000806040838503121561117257600080fd5b600061118085828601610f5b565b925050602061119185828601610f5b565b9150509250929050565b600080600080608085870312156111b157600080fd5b60006111bf87828801610f6f565b94505060206111d087828801610f6f565b93505060406111e187828801610f6f565b92505060606111f287828801610d07565b91505092959194509250565b611207816116f7565b82525050565b600061121882611699565b80845260208401935061122a83611672565b60005b8281101561125c576112408683516111fe565b611249826116d0565b915060208601955060018101905061122d565b50849250505092915050565b6000611273826116a4565b8084526020840193508360208202850161128c8561167f565b60005b848110156112c55783830388526112a7838351611376565b92506112b2826116dd565b915060208801975060018101905061128f565b508196508694505050505092915050565b60006112e1826116af565b8084526020840193506112f38361168c565b60005b82811015611325576113098683516113ac565b611312826116ea565b91506020860195506001810190506112f6565b50849250505092915050565b61133a81611717565b82525050565b600061134b826116c5565b80845261135f816020860160208601611772565b611368816117a5565b602085010191505092915050565b6000611381826116ba565b808452611395816020860160208601611772565b61139e816117a5565b602085010191505092915050565b6113b581611723565b82525050565b60006020820190506113d060008301846111fe565b92915050565b600060a08201905081810360008301526113f08188611268565b9050818103602083015261140481876112d6565b9050818103604083015261141881866112d6565b9050818103606083015261142c81856112d6565b90508181036080830152611440818461120d565b90509695505050505050565b60006020820190506114616000830184611331565b92915050565b60006101008201905061147d600083018b611331565b61148a602083018a6111fe565b61149760408301896113ac565b6114a460608301886113ac565b6114b160808301876113ac565b6114be60a08301866113ac565b6114cb60c08301856113ac565b6114d860e08301846111fe565b9998505050505050505050565b600060208201905081810360008301526114ff8184611340565b905092915050565b600060408201905081810360008301526115218185611340565b905061153060208301846111fe565b9392505050565b600060608201905061154c60008301866113ac565b61155960208301856113ac565b818103604083015261156b8184611268565b9050949350505050565b6000604051905081810181811067ffffffffffffffff8211171561159857600080fd5b8060405250919050565b600067ffffffffffffffff8211156115b957600080fd5b602082029050602081019050919050565b600067ffffffffffffffff8211156115e157600080fd5b602082029050602081019050919050565b600067ffffffffffffffff82111561160957600080fd5b602082029050602081019050919050565b600067ffffffffffffffff82111561163157600080fd5b601f19601f8301169050602081019050919050565b600067ffffffffffffffff82111561165d57600080fd5b601f19601f8301169050602081019050919050565b6000602082019050919050565b6000602082019050919050565b6000602082019050919050565b600081519050919050565b600081519050919050565b600081519050919050565b600081519050919050565b600081519050919050565b6000602082019050919050565b6000602082019050919050565b6000602082019050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b60008115159050919050565b6000819050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b60008115159050919050565b6000819050919050565b82818337600083830152505050565b60005b83811015611790578082015181840152602081019050611775565b8381111561179f576000848401525b50505050565b6000601f19601f83011690509190505600a265627a7a72305820049a7653b9347a5749ebf7251ddfbec3bd0f108adaab2babc4e8857d8b163ef66c6578706572696d656e74616cf50037";

    public static final String ABI = "[{\"constant\":true,\"inputs\":[],\"name\":\"getTopicAddress\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"pageIndex\",\"type\":\"uint256\"},{\"name\":\"pageSize\",\"type\":\"uint256\"}],\"name\":\"listTopicName\",\"outputs\":[{\"name\":\"total\",\"type\":\"uint256\"},{\"name\":\"size\",\"type\":\"uint256\"},{\"name\":\"topics\",\"type\":\"string[]\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"topicName\",\"type\":\"string[]\"},{\"name\":\"topicSender\",\"type\":\"address[]\"},{\"name\":\"topicTimestamp\",\"type\":\"uint256[]\"},{\"name\":\"topicBlock\",\"type\":\"uint256[]\"},{\"name\":\"lastSequence\",\"type\":\"uint256[]\"},{\"name\":\"lastBlock\",\"type\":\"uint256[]\"},{\"name\":\"lastTimestamp\",\"type\":\"uint256[]\"},{\"name\":\"lastSender\",\"type\":\"address[]\"}],\"name\":\"flushTopicInfo\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"topicName\",\"type\":\"string\"}],\"name\":\"getTopicInfo\",\"outputs\":[{\"name\":\"exist\",\"type\":\"bool\"},{\"name\":\"topicSender\",\"type\":\"address\"},{\"name\":\"topicTimestamp\",\"type\":\"uint256\"},{\"name\":\"topicBlock\",\"type\":\"uint256\"},{\"name\":\"lastSequence\",\"type\":\"uint256\"},{\"name\":\"lastBlock\",\"type\":\"uint256\"},{\"name\":\"lastTimestamp\",\"type\":\"uint256\"},{\"name\":\"lastSender\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"topicName\",\"type\":\"string\"}],\"name\":\"addTopicInfo\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"name\":\"topicAddress\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"}]";

    public static final TransactionDecoder transactionDecoder = new TransactionDecoder(ABI, BINARY);

    public static final String FUNC_GETTOPICADDRESS = "getTopicAddress";

    public static final String FUNC_LISTTOPICNAME = "listTopicName";

    public static final String FUNC_FLUSHTOPICINFO = "flushTopicInfo";

    public static final String FUNC_GETTOPICINFO = "getTopicInfo";

    public static final String FUNC_ADDTOPICINFO = "addTopicInfo";

    @Deprecated
    protected TopicController(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TopicController(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TopicController(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TopicController(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static TransactionDecoder getTransactionDecoder() {
        return transactionDecoder;
    }

    public RemoteCall<String> getTopicAddress() {
        final Function function = new Function(FUNC_GETTOPICADDRESS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, List<String>>> listTopicName(BigInteger pageIndex, BigInteger pageSize) {
        final Function function = new Function(FUNC_LISTTOPICNAME,
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(pageIndex),
                        new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(pageSize)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {
                }, new TypeReference<Uint256>() {
                }, new TypeReference<DynamicArray<Utf8String>>() {
                }));
        return new RemoteCall<Tuple3<BigInteger, BigInteger, List<String>>>(
                new Callable<Tuple3<BigInteger, BigInteger, List<String>>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, List<String>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, List<String>>(
                                (BigInteger) results.get(0).getValue(),
                                (BigInteger) results.get(1).getValue(),
                                convertToNative((List<Utf8String>) results.get(2).getValue()));
                    }
                });
    }

    public RemoteCall<TransactionReceipt> flushTopicInfo(List<String> topicName, List<String> topicSender, List<BigInteger> topicTimestamp, List<BigInteger> topicBlock, List<BigInteger> lastSequence, List<BigInteger> lastBlock, List<BigInteger> lastTimestamp, List<String> lastSender) {
        final Function function = new Function(
                FUNC_FLUSHTOPICINFO,
                Arrays.<Type>asList(topicName.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("string[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Utf8String>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicName, org.fisco.bcos.web3j.abi.datatypes.Utf8String.class)),
                        topicSender.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("address[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Address>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicSender, org.fisco.bcos.web3j.abi.datatypes.Address.class)),
                        topicTimestamp.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicTimestamp, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        topicBlock.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicBlock, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastSequence.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastSequence, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastBlock.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastBlock, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastTimestamp.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastTimestamp, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastSender.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("address[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Address>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastSender, org.fisco.bcos.web3j.abi.datatypes.Address.class))),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void flushTopicInfo(List<String> topicName, List<String> topicSender, List<BigInteger> topicTimestamp, List<BigInteger> topicBlock, List<BigInteger> lastSequence, List<BigInteger> lastBlock, List<BigInteger> lastTimestamp, List<String> lastSender, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_FLUSHTOPICINFO,
                Arrays.<Type>asList(topicName.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("string[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Utf8String>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicName, org.fisco.bcos.web3j.abi.datatypes.Utf8String.class)),
                        topicSender.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("address[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Address>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicSender, org.fisco.bcos.web3j.abi.datatypes.Address.class)),
                        topicTimestamp.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicTimestamp, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        topicBlock.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicBlock, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastSequence.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastSequence, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastBlock.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastBlock, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastTimestamp.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastTimestamp, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastSender.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("address[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Address>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastSender, org.fisco.bcos.web3j.abi.datatypes.Address.class))),
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String flushTopicInfoSeq(List<String> topicName, List<String> topicSender, List<BigInteger> topicTimestamp, List<BigInteger> topicBlock, List<BigInteger> lastSequence, List<BigInteger> lastBlock, List<BigInteger> lastTimestamp, List<String> lastSender) {
        final Function function = new Function(
                FUNC_FLUSHTOPICINFO,
                Arrays.<Type>asList(topicName.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("string[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Utf8String>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicName, org.fisco.bcos.web3j.abi.datatypes.Utf8String.class)),
                        topicSender.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("address[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Address>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicSender, org.fisco.bcos.web3j.abi.datatypes.Address.class)),
                        topicTimestamp.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicTimestamp, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        topicBlock.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(topicBlock, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastSequence.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastSequence, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastBlock.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastBlock, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastTimestamp.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("uint256[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.generated.Uint256>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastTimestamp, org.fisco.bcos.web3j.abi.datatypes.generated.Uint256.class)),
                        lastSender.isEmpty() ? org.fisco.bcos.web3j.abi.datatypes.DynamicArray.empty("address[]") : new org.fisco.bcos.web3j.abi.datatypes.DynamicArray<org.fisco.bcos.web3j.abi.datatypes.Address>(
                                org.fisco.bcos.web3j.abi.Utils.typeMap(lastSender, org.fisco.bcos.web3j.abi.datatypes.Address.class))),
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public Tuple8<List<String>, List<String>, List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>, List<String>> getFlushTopicInfoInput(TransactionReceipt transactionReceipt) {
        String data = transactionReceipt.getInput().substring(10);
        final Function function = new Function(FUNC_FLUSHTOPICINFO,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Utf8String>>() {
                }, new TypeReference<DynamicArray<Address>>() {
                }, new TypeReference<DynamicArray<Uint256>>() {
                }, new TypeReference<DynamicArray<Uint256>>() {
                }, new TypeReference<DynamicArray<Uint256>>() {
                }, new TypeReference<DynamicArray<Uint256>>() {
                }, new TypeReference<DynamicArray<Uint256>>() {
                }, new TypeReference<DynamicArray<Address>>() {
                }));
        List<Type> results = FunctionReturnDecoder.decode(data, function.getOutputParameters());
        ;
        return new Tuple8<List<String>, List<String>, List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>, List<String>>(

                convertToNative((List<Utf8String>) results.get(0).getValue()),
                convertToNative((List<Address>) results.get(1).getValue()),
                convertToNative((List<Uint256>) results.get(2).getValue()),
                convertToNative((List<Uint256>) results.get(3).getValue()),
                convertToNative((List<Uint256>) results.get(4).getValue()),
                convertToNative((List<Uint256>) results.get(5).getValue()),
                convertToNative((List<Uint256>) results.get(6).getValue()),
                convertToNative((List<Address>) results.get(7).getValue())
        );
    }

    public RemoteCall<Tuple8<Boolean, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, String>> getTopicInfo(String topicName) {
        final Function function = new Function(FUNC_GETTOPICINFO,
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(topicName)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }, new TypeReference<Address>() {
                }, new TypeReference<Uint256>() {
                }, new TypeReference<Uint256>() {
                }, new TypeReference<Uint256>() {
                }, new TypeReference<Uint256>() {
                }, new TypeReference<Uint256>() {
                }, new TypeReference<Address>() {
                }));
        return new RemoteCall<Tuple8<Boolean, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, String>>(
                new Callable<Tuple8<Boolean, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, String>>() {
                    @Override
                    public Tuple8<Boolean, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple8<Boolean, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, String>(
                                (Boolean) results.get(0).getValue(),
                                (String) results.get(1).getValue(),
                                (BigInteger) results.get(2).getValue(),
                                (BigInteger) results.get(3).getValue(),
                                (BigInteger) results.get(4).getValue(),
                                (BigInteger) results.get(5).getValue(),
                                (BigInteger) results.get(6).getValue(),
                                (String) results.get(7).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> addTopicInfo(String topicName) {
        final Function function = new Function(
                FUNC_ADDTOPICINFO,
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(topicName)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void addTopicInfo(String topicName, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_ADDTOPICINFO,
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(topicName)),
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String addTopicInfoSeq(String topicName) {
        final Function function = new Function(
                FUNC_ADDTOPICINFO,
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(topicName)),
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public Tuple1<String> getAddTopicInfoInput(TransactionReceipt transactionReceipt) {
        String data = transactionReceipt.getInput().substring(10);
        final Function function = new Function(FUNC_ADDTOPICINFO,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {
                }));
        List<Type> results = FunctionReturnDecoder.decode(data, function.getOutputParameters());
        ;
        return new Tuple1<String>(

                (String) results.get(0).getValue()
        );
    }

    public Tuple1<Boolean> getAddTopicInfoOutput(TransactionReceipt transactionReceipt) {
        String data = transactionReceipt.getOutput();
        final Function function = new Function(FUNC_ADDTOPICINFO,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        List<Type> results = FunctionReturnDecoder.decode(data, function.getOutputParameters());
        ;
        return new Tuple1<Boolean>(

                (Boolean) results.get(0).getValue()
        );
    }

    @Deprecated
    public static TopicController load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TopicController(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TopicController load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TopicController(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TopicController load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TopicController(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TopicController load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TopicController(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TopicController> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String topicAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(topicAddress)));
        return deployRemoteCall(TopicController.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<TopicController> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String topicAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(topicAddress)));
        return deployRemoteCall(TopicController.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<TopicController> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String topicAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(topicAddress)));
        return deployRemoteCall(TopicController.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<TopicController> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String topicAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(topicAddress)));
        return deployRemoteCall(TopicController.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
