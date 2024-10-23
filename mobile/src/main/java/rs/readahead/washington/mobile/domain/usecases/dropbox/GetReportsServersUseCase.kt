package rs.readahead.washington.mobile.domain.usecases.dropbox

import io.reactivex.Single
import rs.readahead.washington.mobile.domain.entity.dropbox.DropBoxServer
import rs.readahead.washington.mobile.domain.repository.dropbox.ITellaDropBoxRepository
import rs.readahead.washington.mobile.domain.usecases.base.SingleUseCase
import javax.inject.Inject

class GetReportsServersUseCase @Inject constructor(
    private val serverRepository: ITellaDropBoxRepository,
) :
    SingleUseCase<List<DropBoxServer>>() {

    override fun buildUseCaseSingle(): Single<List<DropBoxServer>> {
        return serverRepository.listDropBoxServers()
    }
}